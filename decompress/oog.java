// 
// Decompiled by Procyon v0.6.0
// 

public final class oog
{
    public static final void a(final hub<? super d86, ? super Integer, vzv> hub, d86 h, final int n) {
        e0e.f((Object)hub, "content");
        h = h.h(-1322912246);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)hub)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        if ((n3 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            final sa6$b a = sa6.a;
            hub.invoke((Object)h, (Object)(n3 & 0xE));
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new oog$a((hub)hub, n));
        }
    }
}
