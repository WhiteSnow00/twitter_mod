// 
// Decompiled by Procyon v0.6.0
// 

public final class rkt
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public static final class a
    {
        public final zf4 a(final long a, final nca nca, final ada ada, final qzo qzo, final String s) {
            zzd.f((Object)nca, "refEventNamespace");
            zzd.f((Object)ada, "pageEventSectionPrefix");
            final nca$a companion = nca.Companion;
            final String b = ((tca)ada).b();
            final String d = ada.d();
            String f = null;
            Label_0063: {
                if (qzo != null) {
                    f = qzo.f;
                    if (f != null) {
                        break Label_0063;
                    }
                }
                f = "";
            }
            String g = null;
            Label_0090: {
                if (qzo != null) {
                    g = qzo.g;
                    if (g != null) {
                        break Label_0090;
                    }
                }
                g = "";
            }
            final zf4 zf4 = new zf4(companion.e(b, d, f, g, s));
            final lev lev = new lev();
            lev.a = a;
            lev.c = 36;
            zf4.i((szo)lev);
            zf4.U = nca.toString();
            final int a2 = w4j.a;
            return zf4;
        }
    }
}
