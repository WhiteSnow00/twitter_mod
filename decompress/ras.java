import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public class ras
{
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;
    
    public ras() {
        if (jb2.N0 == null) {
            jb2.N0 = new jb2();
        }
    }
    
    public final int a(int short1) {
        if (short1 < this.d) {
            short1 = this.b.getShort(this.c + short1);
        }
        else {
            short1 = 0;
        }
        return short1;
    }
    
    public final void b(int n, final ByteBuffer b) {
        this.b = b;
        if (b != null) {
            this.a = n;
            n -= b.getInt(n);
            this.c = n;
            this.d = this.b.getShort(n);
        }
        else {
            this.a = 0;
            this.c = 0;
            this.d = 0;
        }
    }
}
