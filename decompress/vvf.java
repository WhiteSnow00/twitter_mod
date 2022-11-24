// 
// Decompiled by Procyon v0.6.0
// 

public class vvf extends rr1
{
    public final int a;
    
    public vvf(final int a) {
        this.a = a;
    }
    
    public final u4x H() {
        switch (this.a) {
            default: {
                return super.H();
            }
            case 2: {
                return this.n();
            }
            case 1: {
                return this.n();
            }
        }
    }
    
    public final int b() {
        switch (this.a) {
            default: {
                return 22;
            }
            case 1: {
                return 23;
            }
            case 0: {
                return 7;
            }
        }
    }
    
    public int d(final a3 a3) {
        final int a4 = this.a;
        int n = 4;
        switch (a4) {
            default: {
                if (!d4j.a0(a3)) {
                    n = 3;
                }
                return n;
            }
            case 1: {
                if (!d4j.a0(a3)) {
                    n = 3;
                }
                return n;
            }
            case 0: {
                return 5;
            }
        }
    }
    
    public final boolean e(final h1 h1) {
        boolean b = false;
        switch (this.a) {
            default: {
                return false;
            }
            case 2: {
                e0e.f((Object)h1, "dataSource");
                b = w6.h(h1);
                break;
            }
            case 1: {
                e0e.f((Object)h1, "dataSource");
                b = w6.h(h1);
                break;
            }
        }
        return b ^ true;
    }
    
    public final boolean f() {
        return true;
    }
    
    public final boolean g() {
        switch (this.a) {
            default: {
                return true;
            }
            case 1:
            case 2: {
                return false;
            }
        }
    }
    
    public String getName() {
        switch (this.a) {
            default: {
                return vvf.class.getName();
            }
            case 1: {
                return vvf.class.getName();
            }
            case 0: {
                return vvf.class.getName();
            }
        }
    }
    
    public final boolean k() {
        return true;
    }
    
    public final boolean l() {
        switch (this.a) {
            default: {
                return true;
            }
            case 1:
            case 2: {
                return false;
            }
        }
    }
    
    public final u4x n() {
        switch (this.a) {
            default: {
                Object o;
                if (lp7.U()) {
                    o = hm3.c;
                }
                else {
                    o = super.H();
                    e0e.e(o, "super.getThumbnailPresenterFactory()");
                }
                return (u4x)o;
            }
            case 1: {
                Object o2;
                if (lp7.U()) {
                    o2 = hm3.b;
                }
                else {
                    o2 = super.H();
                    e0e.e(o2, "super.getThumbnailPresenterFactory()");
                }
                return (u4x)o2;
            }
        }
    }
}
