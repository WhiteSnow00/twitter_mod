import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import android.util.Log;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public interface uyr extends Closeable
{
    tyr H2();
    
    void close();
    
    String getDatabaseName();
    
    void setWriteAheadLoggingEnabled(final boolean p0);
    
    public abstract static class a
    {
        public final int a;
        
        public a(final int a) {
            this.a = a;
        }
        
        public final void a(final String s) {
            if (!s.equalsIgnoreCase(":memory:")) {
                if (s.trim().length() != 0) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("deleting the database file: ");
                    sb.append(s);
                    Log.w("SupportSQLite", sb.toString());
                    try {
                        SQLiteDatabase.deleteDatabase(new File(s));
                    }
                    catch (final Exception ex) {
                        Log.w("SupportSQLite", "delete failed: ", (Throwable)ex);
                    }
                }
            }
        }
        
        public abstract void b();
        
        public abstract void c(final tyr p0);
        
        public abstract void d(final tyr p0, final int p1, final int p2);
        
        public abstract void e(final tyr p0);
        
        public abstract void f(final tyr p0, final int p1, final int p2);
    }
    
    public static final class b
    {
        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;
        public final boolean e;
        
        public b(final Context a, final String b, final a c, final boolean d, final boolean e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
    
    public interface c
    {
        uyr a(final b p0);
    }
}
