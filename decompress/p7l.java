import tv.periscope.model.NarrowcastSpaceType$SuperFollowerOnly;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p7l extends gue implements rtb<lfw, m7l.a.a>
{
    public static final p7l C0;
    
    static {
        C0 = new p7l();
    }
    
    public p7l() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final lfw lfw = (lfw)o;
        zzd.f((Object)lfw, "it");
        Objects.requireNonNull(m7l.Companion);
        final ce1 f0 = ce1.F0;
        final ce1 d0 = ce1.D0;
        final snj b = snj.b;
        final int a = w4j.a;
        final nfw a2 = lfw.a;
        final rfw b2 = lfw.b;
        final Object o2 = null;
        String a5 = null;
        Label_0083: {
            if (b2 != null) {
                final lof a3 = b2.a;
                if (a3 != null) {
                    final s01 a4 = a3.a;
                    if (a4 != null) {
                        a5 = a4.a;
                        break Label_0083;
                    }
                }
            }
            a5 = null;
        }
        snj snj;
        ce1 ce1;
        if (a5 != null && bgl.s()) {
            snj = new snj((Object)a5);
            ce1 = f0;
        }
        else {
            snj = b;
            ce1 = d0;
        }
        ce1 ce2 = ce1;
        snj snj2 = b;
        if (a2 != null) {
            ce1 ce3;
            if ((ce3 = ce1) != f0) {
                ce1 ce4;
                if (a2.b) {
                    ce4 = ce1.C0;
                }
                else {
                    ce4 = ce1.E0;
                }
                ce3 = ce4;
            }
            snj2 = new snj((Object)a2.a);
            ce2 = ce3;
        }
        final rfw b3 = lfw.b;
        Object p = o2;
        if (b3 != null) {
            final lof a6 = b3.a;
            p = o2;
            if (a6 != null) {
                final s01 a7 = a6.a;
                p = o2;
                if (a7 != null) {
                    p = a7.p;
                }
            }
        }
        return new m7l.a.a(ce2, (snj<String>)snj, (snj<String>)snj2, zzd.a(p, (Object)NarrowcastSpaceType$SuperFollowerOnly.INSTANCE));
    }
}
