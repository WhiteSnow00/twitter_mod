// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jie
{
    public final int a;
    public int b;
    public int c;
    
    public jie() {
        this.a = 0;
    }
    
    public jie(final int b, final int c) {
        this.a = 1;
        this.b = b;
        this.c = c;
    }
    
    public abstract byte[] a();
    
    public abstract byte[] b(final int p0, final byte[] p1);
    
    public final boolean c() {
        final int b = this.b;
        boolean b2 = true;
        if (b != 1) {
            b2 = false;
        }
        return b2;
    }
    
    public final boolean d() {
        return this.b == 2;
    }
    
    public final boolean e() {
        return this.b == 0;
    }
    
    public jie f() {
        return new rzd(this);
    }
    
    public final String g() {
        final int b = this.b;
        if (b == 0) {
            return "root";
        }
        if (b == 1) {
            return "Array";
        }
        if (b != 2) {
            return "?";
        }
        return "Object";
    }
    
    @Override
    public String toString() {
        switch (this.a) {
            default: {
                return super.toString();
            }
            case 1: {
                final int b = this.b;
                byte[] b2 = new byte[b];
                final StringBuilder sb = new StringBuilder((b + 1) * this.c);
                for (int i = 0; i < this.c; ++i) {
                    b2 = this.b(i, b2);
                    for (int j = 0; j < this.b; ++j) {
                        final int n = b2[j] & 0xFF;
                        char c;
                        if (n < 64) {
                            c = '#';
                        }
                        else if (n < 128) {
                            c = '+';
                        }
                        else if (n < 192) {
                            c = '.';
                        }
                        else {
                            c = ' ';
                        }
                        sb.append(c);
                    }
                    sb.append('\n');
                }
                return sb.toString();
            }
        }
    }
}
