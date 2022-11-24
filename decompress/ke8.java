import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ke8 implements sx
{
    public final boolean a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public rx[] f;
    
    public ke8() {
        this.a = true;
        this.b = 65536;
        this.e = 0;
        this.f = new rx[100];
    }
    
    public final void a() {
        synchronized (this) {
            final int c = this.c;
            final int b = this.b;
            final int a = rnw.a;
            final int max = Math.max(0, (c + b - 1) / b - this.d);
            final int e = this.e;
            if (max >= e) {
                return;
            }
            Arrays.fill(this.f, max, e, null);
            this.e = max;
        }
    }
}
