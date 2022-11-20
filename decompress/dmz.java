import com.google.android.gms.internal.measurement.zzkm;

// 
// Decompiled by Procyon v0.6.0
// 

public class dmz
{
    public volatile loz a;
    public volatile phz b;
    
    static {
        wiz.a();
    }
    
    public final int a() {
        if (this.b != null) {
            return ((xgz)this.b).F0.length;
        }
        if (this.a != null) {
            return this.a.c();
        }
        return 0;
    }
    
    public final phz b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = (phz)phz.E0;
            }
            else {
                this.b = this.a.f();
            }
            return this.b;
        }
    }
    
    public final void c(final loz loz) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a == null) {
                try {
                    this.a = loz;
                    this.b = (phz)phz.E0;
                }
                catch (final zzkm zzkm) {
                    this.a = loz;
                    this.b = (phz)phz.E0;
                }
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dmz)) {
            return false;
        }
        final dmz dmz = (dmz)o;
        final loz a = this.a;
        final loz a2 = dmz.a;
        if (a == null && a2 == null) {
            return this.b().equals((Object)dmz.b());
        }
        if (a != null && a2 != null) {
            return a.equals(a2);
        }
        if (a != null) {
            dmz.c(((ooz)a).e());
            return a.equals(dmz.a);
        }
        this.c(((ooz)a2).e());
        return this.a.equals(a2);
    }
    
    @Override
    public final int hashCode() {
        return 1;
    }
}
