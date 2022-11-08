// 
// Decompiled by Procyon v0.6.0
// 

public final class yoz implements snz
{
    public final xnz a;
    public final String b;
    public final Object[] c;
    public final int d;
    
    public yoz(final xnz a, final String b, final Object[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
        final char char1 = b.charAt(0);
        if (char1 < '\ud800') {
            this.d = char1;
            return;
        }
        int n = char1 & '\u1fff';
        int n2 = 1;
        int n3 = 13;
        char char2;
        while (true) {
            char2 = b.charAt(n2);
            if (char2 < '\ud800') {
                break;
            }
            n |= (char2 & '\u1fff') << n3;
            n3 += 13;
            ++n2;
        }
        this.d = (n | char2 << n3);
    }
    
    public final xnz a() {
        return this.a;
    }
    
    public final boolean c() {
        return (this.d & 0x2) == 0x2;
    }
    
    public final int d() {
        if ((this.d & 0x1) == 0x1) {
            return 1;
        }
        return 2;
    }
}
