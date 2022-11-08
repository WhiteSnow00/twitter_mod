import com.google.android.gms.internal.measurement.zzkm;

// 
// Decompiled by Procyon v0.6.0
// 

public class plz
{
    public volatile xnz a;
    public volatile bhz b;
    
    static {
        iiz.a();
    }
    
    public final int a() {
        if (this.b != null) {
            return ((jgz)this.b).E0.length;
        }
        if (this.a != null) {
            return this.a.c();
        }
        return 0;
    }
    
    public final bhz b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = (bhz)bhz.D0;
            }
            else {
                this.b = this.a.f();
            }
            return this.b;
        }
    }
    
    public final void c(final xnz xnz) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a == null) {
                try {
                    this.a = xnz;
                    this.b = (bhz)bhz.D0;
                }
                catch (final zzkm zzkm) {
                    this.a = xnz;
                    this.b = (bhz)bhz.D0;
                }
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof plz)) {
            return false;
        }
        final plz plz = (plz)o;
        final xnz a = this.a;
        final xnz a2 = plz.a;
        if (a == null && a2 == null) {
            return this.b().equals((Object)plz.b());
        }
        if (a != null && a2 != null) {
            return a.equals(a2);
        }
        if (a != null) {
            plz.c(((aoz)a).e());
            return a.equals(plz.a);
        }
        this.c(((aoz)a2).e());
        return this.a.equals(a2);
    }
    
    @Override
    public final int hashCode() {
        return 1;
    }
}
