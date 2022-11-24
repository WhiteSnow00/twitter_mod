import java.util.Locale;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fa7<T extends Cursor> extends p4e<T>
{
    public final T G0;
    
    public fa7(final T g0) {
        this.G0 = g0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof fa7 && o5j.a((Object)((fa7)o).G0, (Object)this.G0));
    }
    
    @Override
    public final int getSize() {
        final Cursor g0 = this.G0;
        if (g0 == null) {
            return 0;
        }
        if (g0.isClosed()) {
            c0e.i("Cursor is closed");
            return 0;
        }
        return this.G0.getCount();
    }
    
    @Override
    public final int hashCode() {
        final Cursor g0 = this.G0;
        int hashCode;
        if (g0 == null) {
            hashCode = 0;
        }
        else {
            hashCode = g0.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final void i() {
        final Cursor g0 = this.G0;
        if (g0 != null) {
            g0.close();
        }
    }
    
    @Override
    public final /* bridge */ Object m(final int n) {
        return this.q(n);
    }
    
    public final T q(final int n) {
        if (n < this.getSize()) {
            final Cursor g0 = this.G0;
            if (g0 != null) {
                if (g0.moveToPosition(n)) {
                    return this.G0;
                }
                r9a.d((Throwable)new IllegalArgumentException(String.format(Locale.ENGLISH, "CursorItemCollection: can't move to position = %s in collection of size = %s", n, this.getSize())));
            }
        }
        return null;
    }
}
