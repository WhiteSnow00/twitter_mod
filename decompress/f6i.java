import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f6i
{
    public final int a;
    public boolean b;
    public boolean c;
    public byte[] d;
    public int e;
    
    public f6i(final int a) {
        this.a = a;
        (this.d = new byte[131])[2] = 1;
    }
    
    public final void a(final byte[] array, final int n, int n2) {
        if (!this.b) {
            return;
        }
        n2 -= n;
        final byte[] d = this.d;
        final int length = d.length;
        final int e = this.e;
        if (length < e + n2) {
            this.d = Arrays.copyOf(d, (e + n2) * 2);
        }
        System.arraycopy(array, n, this.d, this.e, n2);
        this.e += n2;
    }
    
    public final boolean b(final int n) {
        if (!this.b) {
            return false;
        }
        this.e -= n;
        this.b = false;
        return this.c = true;
    }
    
    public final void c() {
        this.b = false;
        this.c = false;
    }
    
    public final void d(final int n) {
        final boolean b = this.b;
        boolean b2 = true;
        omy.k(b ^ true);
        if (n != this.a) {
            b2 = false;
        }
        this.b = b2;
        if (b2) {
            this.e = 3;
            this.c = false;
        }
    }
}
