import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tdq
{
    public static final n5r<sr4> a;
    
    static {
        a = eg8.G0(0.0f, null, 7);
    }
    
    public static final l9r a(final long n, final ac0 ac0, final d86 d86, final int n2) {
        d86.x(-1942442407);
        final sa6$b a = sa6.a;
        final l9r b = b(n, ac0, (stb)null, d86, (n2 & 0xE) | 0x40 | (n2 << 3 & 0x1C00), 4);
        d86.O();
        return b;
    }
    
    public static final l9r<sr4> b(final long n, ac0<sr4> a, String s, final stb<? super sr4, vzv> stb, final d86 d86, int n2, int p7) {
        ((d86)stb).x(-451899108);
        if ((n2 & 0x2) != 0x0) {
            a = tdq.a;
        }
        String s2;
        if ((n2 & 0x4) != 0x0) {
            s2 = "ColorAnimation";
        }
        else {
            s2 = null;
        }
        if ((n2 & 0x8) != 0x0) {
            s = null;
        }
        final sa6$b a2 = sa6.a;
        final es4 f = sr4.f(n);
        ((d86)stb).x(1157296644);
        p7 = (((d86)stb).P((Object)f) ? 1 : 0);
        final Object y = ((d86)stb).y();
        Object o = null;
        Label_0144: {
            if (p7 == 0) {
                Objects.requireNonNull(d86.Companion);
                if ((o = y) != d86$a.b) {
                    break Label_0144;
                }
            }
            ns4.b(sr4.Companion);
            o = ns4.a.invoke((Object)sr4.f(n));
            ((d86)stb).p(o);
        }
        ((d86)stb).O();
        final liv liv = (liv)o;
        final sr4 sr4 = new sr4(n);
        n2 = (int)(d86 << 6);
        final l9r<sr4> c = v80.c(sr4, (liv<sr4, lc0>)liv, (ac0<sr4>)a, null, s2, (stb<? super sr4, vzv>)s, (d86)stb, (int)((0x70000 & n2) | ((d86 & 0xE) | 0x240 | (0xE000 & n2))), 8);
        ((d86)stb).O();
        return c;
    }
}
