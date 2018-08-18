package com.framework.util.util_framework.localsqlite;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.xuwei.framework.utils.ToastUtils;

//使用时应注意使用事务  即begintracsition  set----，end------
public class MyLocalSqLiteHelper extends SQLiteOpenHelper {
    private Context mContext;
    private static MyLocalSqLiteHelper helperInstance;

    public MyLocalSqLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext=context;
    }

    public MyLocalSqLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    /**
     * Gets helper instance.
     *这里使用第一个参数较少的构造方法
     * @param context the context       环境上下文
     * @param name    the name      数据库名称
     * @param factory the factory       传回来的自定义cursor
     * @param version the version       数据库版本号
     * @return the helper instance
     */

    public static MyLocalSqLiteHelper getHelperInstance(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        //双重锁的单例模式
        if(helperInstance==null) {
            synchronized (MyLocalSqLiteHelper.class) {
                if (helperInstance == null) {
                    helperInstance = new MyLocalSqLiteHelper(context, name, factory, version);
                }
                return helperInstance;
            }
        }
        return helperInstance;
    }
    public static final String CREATE_TABLE="create table user("
            +"id integer primary key autoincrement,"
            +"password text)";
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        ToastUtils.getInstance(mContext).show("create succeed");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
