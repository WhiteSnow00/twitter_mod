import android.util.AttributeSet;
import android.content.Context;
import java.util.HashSet;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class zpe
{
    public int a;
    public int b;
    public String c;
    public HashMap<String, lj6> d;
    
    public zpe() {
        this.a = -1;
        this.b = -1;
        this.c = null;
    }
    
    public abstract void a(final HashMap<String, acx> p0);
    
    public abstract zpe b();
    
    public zpe c(final zpe zpe) {
        this.a = zpe.a;
        this.b = zpe.b;
        this.c = zpe.c;
        this.d = zpe.d;
        return this;
    }
    
    public /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.b();
    }
    
    public abstract void d(final HashSet<String> p0);
    
    public abstract void e(final Context p0, final AttributeSet p1);
    
    public void f(final HashMap<String, Integer> hashMap) {
    }
}
