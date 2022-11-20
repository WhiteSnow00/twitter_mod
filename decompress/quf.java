// 
// Decompiled by Procyon v0.6.0
// 

public class quf extends kr1
{
    public final int a;
    
    public quf(final int a) {
        this.a = a;
    }
    
    public final c4x H() {
        switch (this.a) {
            default: {
                return this.n();
            }
            case 1: {
                return this.n();
            }
            case 0: {
                return (c4x)new kmi();
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
                return 8;
            }
        }
    }
    
    public int d(final g3 g3) {
        final int a = this.a;
        int n = 4;
        switch (a) {
            default: {
                if (!g63.I(g3)) {
                    n = 3;
                }
                return n;
            }
            case 1: {
                if (!g63.I(g3)) {
                    n = 3;
                }
                return n;
            }
            case 0: {
                return 5;
            }
        }
    }
    
    public final boolean e(final i1 i1) {
        boolean b = false;
        switch (this.a) {
            default: {
                return this instanceof uzf;
            }
            case 2: {
                czd.f((Object)i1, "dataSource");
                b = x6.h(i1);
                break;
            }
            case 1: {
                czd.f((Object)i1, "dataSource");
                b = x6.h(i1);
                break;
            }
        }
        return b ^ true;
    }
    
    public final boolean f() {
        switch (this.a) {
            default: {
                return this instanceof lss;
            }
            case 1:
            case 2: {
                return true;
            }
        }
    }
    
    public final boolean g() {
        switch (this.a) {
            default: {
                return this instanceof lss ^ true;
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
                return quf.class.getName();
            }
            case 1: {
                return quf.class.getName();
            }
            case 0: {
                return ruf.class.getName();
            }
        }
    }
    
    public final boolean h() {
        switch (this.a) {
            default: {
                return false;
            }
            case 0: {
                return true;
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
    
    public final c4x n() {
        switch (this.a) {
            default: {
                Object o;
                if (g97.u()) {
                    o = gl3.c;
                }
                else {
                    o = super.H();
                    czd.e(o, "super.getThumbnailPresenterFactory()");
                }
                return (c4x)o;
            }
            case 1: {
                Object o2;
                if (g97.u()) {
                    o2 = gl3.b;
                }
                else {
                    o2 = super.H();
                    czd.e(o2, "super.getThumbnailPresenterFactory()");
                }
                return (c4x)o2;
            }
        }
    }
}
