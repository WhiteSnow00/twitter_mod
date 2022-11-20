import android.database.Cursor;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fik implements SQLiteDatabase$CursorFactory
{
    public final khj a;
    
    public fik(final khj a) {
        this.a = a;
    }
    
    public final Cursor newCursor(final SQLiteDatabase sqLiteDatabase, final SQLiteCursorDriver sqLiteCursorDriver, final String s, final SQLiteQuery sqLiteQuery) {
        final khj a = this.a;
        czd.e((Object)sqLiteCursorDriver, "masterQuery");
        czd.e((Object)sqLiteQuery, "query");
        return (Cursor)new gik(sqLiteCursorDriver, s, sqLiteQuery, a);
    }
}
