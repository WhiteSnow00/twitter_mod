// 
// Decompiled by Procyon v0.6.0
// 

public final class aou
{
    public static final nmp<aou> e;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    
    static {
        aou.e = new aou.aou$a();
    }
    
    public aou(final float a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public aou(int b, final int n, final int n2, final int n3, final beq beq) {
        final int a = beq.a;
        final float n4 = 0.0f;
        float a2;
        if (a > 0) {
            a2 = b / (float)a;
        }
        else {
            a2 = 0.0f;
        }
        this.a = a2;
        float c;
        if (a > 0) {
            c = n2 / (float)a;
        }
        else {
            c = 0.0f;
        }
        this.c = c;
        b = beq.b;
        float b2;
        if (b > 0) {
            b2 = n / (float)b;
        }
        else {
            b2 = 0.0f;
        }
        this.b = b2;
        float d = n4;
        if (b > 0) {
            d = n3 / (float)b;
        }
        this.d = d;
    }
}
