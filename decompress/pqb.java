import java.util.UUID;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import java.util.Iterator;
import java.util.List;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import android.util.Pair;
import android.util.Log;
import java.util.Objects;
import android.database.sqlite.SQLiteDatabase;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import android.os.Build$VERSION;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqb implements i0s
{
    public final Context F0;
    public final String G0;
    public final i0s$a H0;
    public final boolean I0;
    public final boolean J0;
    public final Object K0;
    public a L0;
    public boolean M0;
    
    public pqb(final Context f0, final String g0, final i0s$a h0, final boolean i0, final boolean j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = new Object();
    }
    
    public final h0s H2() {
        return this.a().a(true);
    }
    
    public final a a() {
        synchronized (this.K0) {
            if (this.L0 == null) {
                final oqb[] array = { null };
                if (Build$VERSION.SDK_INT >= 23 && this.G0 != null && this.I0) {
                    final Context f0 = this.F0;
                    e0e.f((Object)f0, "context");
                    final File noBackupFilesDir = f0.getNoBackupFilesDir();
                    e0e.e((Object)noBackupFilesDir, "context.noBackupFilesDir");
                    this.L0 = new a(this.F0, new File(noBackupFilesDir, this.G0).getAbsolutePath(), array, this.H0, this.J0);
                }
                else {
                    this.L0 = new a(this.F0, this.G0, array, this.H0, this.J0);
                }
                final a l0 = this.L0;
                final boolean m0 = this.M0;
                e0e.f((Object)l0, "sQLiteOpenHelper");
                l0.setWriteAheadLoggingEnabled(m0);
            }
            return this.L0;
        }
    }
    
    public final void close() {
        this.a().close();
    }
    
    public final String getDatabaseName() {
        return this.G0;
    }
    
    public final void setWriteAheadLoggingEnabled(final boolean b) {
        synchronized (this.K0) {
            final a l0 = this.L0;
            if (l0 != null) {
                e0e.f((Object)l0, "sQLiteOpenHelper");
                l0.setWriteAheadLoggingEnabled(b);
            }
            this.M0 = b;
        }
    }
    
    public static final class a extends SQLiteOpenHelper
    {
        public final oqb[] F0;
        public final Context G0;
        public final i0s$a H0;
        public final boolean I0;
        public boolean J0;
        public final d1l K0;
        public boolean L0;
        
        public a(final Context g0, final String s, final oqb[] f0, final i0s$a h0, final boolean i0) {
            super(g0, s, (SQLiteDatabase$CursorFactory)null, h0.a, (DatabaseErrorHandler)new DatabaseErrorHandler(h0, f0) {
                public final i0s$a a;
                public final oqb[] b;
                
                public final void onCorruption(SQLiteDatabase sqLiteDatabase) {
                    final i0s$a a = this.a;
                    final oqb c = pqb.a.c(this.b, sqLiteDatabase);
                    Objects.requireNonNull(a);
                    sqLiteDatabase = (SQLiteDatabase)new StringBuilder();
                    ((StringBuilder)sqLiteDatabase).append("Corruption reported by sqlite on database: ");
                    ((StringBuilder)sqLiteDatabase).append(c.s());
                    Log.e("SupportSQLite", ((StringBuilder)sqLiteDatabase).toString());
                    if (!c.isOpen()) {
                        a.a(c.s());
                        return;
                    }
                    final List list = null;
                    while (true) {
                        try {
                            Label_0163: {
                                try {
                                    sqLiteDatabase = (SQLiteDatabase)c.a0();
                                    break Label_0097;
                                }
                                finally {
                                    Label_0107: {
                                        break Label_0107;
                                        try {
                                            c.close();
                                            break Label_0163;
                                            final Iterator iterator;
                                            a.a((String)((Pair)iterator.next()).second);
                                            Label_0118: {
                                                break Label_0118;
                                                iftrue(Label_0160:)(list == null);
                                                Block_10: {
                                                    break Block_10;
                                                    while (true) {
                                                        a.a(c.s());
                                                        continue;
                                                    }
                                                }
                                                iterator = list.iterator();
                                            }
                                            iftrue(Label_0160:)(!iterator.hasNext());
                                        }
                                        catch (final IOException ex) {}
                                    }
                                }
                            }
                            if (sqLiteDatabase != null) {
                                sqLiteDatabase = (SQLiteDatabase)((List<Object>)sqLiteDatabase).iterator();
                                while (((Iterator)sqLiteDatabase).hasNext()) {
                                    a.a((String)((Iterator<Pair>)sqLiteDatabase).next().second);
                                }
                            }
                            else {
                                a.a(c.s());
                            }
                        }
                        catch (final SQLiteException ex2) {
                            continue;
                        }
                        break;
                    }
                }
            });
            this.G0 = g0;
            this.H0 = h0;
            this.F0 = f0;
            this.I0 = i0;
            String string = s;
            if (s == null) {
                string = UUID.randomUUID().toString();
            }
            this.K0 = new d1l(string, g0.getCacheDir());
        }
        
        public static oqb c(final oqb[] array, final SQLiteDatabase sqLiteDatabase) {
            final oqb oqb = array[0];
            if (oqb == null || oqb.F0 != sqLiteDatabase) {
                array[0] = new oqb(sqLiteDatabase);
            }
            return array[0];
        }
        
        public final h0s a(final boolean b) {
            try {
                this.K0.a(!this.L0 && this.getDatabaseName() != null);
                this.J0 = false;
                final SQLiteDatabase e = this.e(b);
                Object o;
                if (this.J0) {
                    this.close();
                    o = this.a(b);
                }
                else {
                    o = this.b(e);
                }
                return (h0s)o;
            }
            finally {
                this.K0.b();
            }
        }
        
        public final oqb b(final SQLiteDatabase sqLiteDatabase) {
            return c(this.F0, sqLiteDatabase);
        }
        
        public final void close() {
            try {
                final d1l k0 = this.K0;
                k0.a(k0.c);
                super.close();
                this.F0[0] = null;
                this.L0 = false;
            }
            finally {
                this.K0.b();
            }
        }
        
        public final SQLiteDatabase d(final boolean b) {
            if (b) {
                return this.getWritableDatabase();
            }
            return this.getReadableDatabase();
        }
        
        public final SQLiteDatabase e(final boolean b) {
            final String databaseName = this.getDatabaseName();
            if (databaseName != null) {
                final File parentFile = this.G0.getDatabasePath(databaseName).getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                    if (!parentFile.isDirectory()) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid database parent file, not a directory: ");
                        sb.append(parentFile);
                        Log.w("SupportSQLite", sb.toString());
                    }
                }
            }
            try {
                return this.d(b);
            }
            finally {
                super.close();
                try {
                    Thread.sleep(500L);
                    try {
                        return this.d(b);
                    }
                    finally {
                        super.close();
                        final b b2;
                        if (b2 instanceof b) {
                            final b b3 = b2;
                            final Throwable g0 = b3.G0;
                            final int g2 = lb0.G(b3.F0);
                            if (g2 == 0 || g2 == 1 || g2 == 2 || g2 == 3) {
                                throw g0;
                            }
                            if (!(g0 instanceof SQLiteException)) {
                                throw g0;
                            }
                        }
                        else if (b2 instanceof SQLiteException && (databaseName != null && this.I0)) {}
                        this.G0.deleteDatabase(databaseName);
                        try {
                            return this.d(b);
                        }
                        catch (final b b4) {
                            throw b4.G0;
                        }
                    }
                }
                catch (final InterruptedException ex) {}
            }
        }
        
        public final void onConfigure(final SQLiteDatabase sqLiteDatabase) {
            try {
                final i0s$a h0 = this.H0;
                this.b(sqLiteDatabase);
                h0.b();
            }
            finally {
                final Throwable t;
                throw new b(1, t);
            }
        }
        
        public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
            try {
                this.H0.c((h0s)this.b(sqLiteDatabase));
            }
            finally {
                final Throwable t;
                throw new b(2, t);
            }
        }
        
        public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
            this.J0 = true;
            try {
                this.H0.d((h0s)this.b(sqLiteDatabase), n, n2);
            }
            finally {
                final Throwable t;
                throw new b(4, t);
            }
        }
        
        public final void onOpen(final SQLiteDatabase sqLiteDatabase) {
            if (!this.J0) {
                try {
                    this.H0.e((h0s)this.b(sqLiteDatabase));
                }
                finally {
                    final Throwable t;
                    throw new b(5, t);
                }
            }
            this.L0 = true;
        }
        
        public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
            this.J0 = true;
            try {
                this.H0.f((h0s)this.b(sqLiteDatabase), n, n2);
            }
            finally {
                final Throwable t;
                throw new b(3, t);
            }
        }
        
        public static final class b extends RuntimeException
        {
            public final int F0;
            public final Throwable G0;
            
            public b(final int f0, final Throwable g0) {
                super(g0);
                this.F0 = f0;
                this.G0 = g0;
            }
            
            @Override
            public final Throwable getCause() {
                return this.G0;
            }
        }
    }
}
