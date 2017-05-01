package gfs.gross.kevin.getfresh;

/**
 * Created by Kevin on 01.05.2017.
 */


import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;
        import android.util.Log;



public class MySQLiteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "NAME_EINFUEGEN.db";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_Zugriff="DbZugriff";

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE");
    }

    public void onCreate(SQLiteDatabase db)
    {
        String createDB = "CREATE TABLE";
    }
}