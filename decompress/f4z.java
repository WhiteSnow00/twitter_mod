import android.content.SharedPreferences$Editor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f4z
{
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final u4z e;
    
    public f4z(final u4z e, final String a, final long b) {
        this.e = e;
        eli.n(a);
        this.a = a;
        this.b = b;
    }
    
    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.n().getLong(this.a, this.b);
        }
        return this.d;
    }
    
    public final void b(final long d) {
        final SharedPreferences$Editor edit = this.e.n().edit();
        edit.putLong(this.a, d);
        edit.apply();
        this.d = d;
    }
}
