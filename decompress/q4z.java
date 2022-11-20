import android.content.SharedPreferences$Editor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q4z
{
    public final String a;
    public boolean b;
    public String c;
    public final u4z d;
    
    public q4z(final u4z d, final String a) {
        this.d = d;
        eli.n(a);
        this.a = a;
    }
    
    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.n().getString(this.a, (String)null);
        }
        return this.c;
    }
    
    public final void b(final String c) {
        final SharedPreferences$Editor edit = this.d.n().edit();
        edit.putString(this.a, c);
        edit.apply();
        this.c = c;
    }
}
