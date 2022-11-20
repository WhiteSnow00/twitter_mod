// 
// Decompiled by Procyon v0.6.0
// 

public final class r6z
{
    public r6z() {
        synchronized (blz.class) {
            final shz shz = new shz();
            shz.a = "common";
            shz.b = Boolean.TRUE;
            shz.c = 1;
            final kiz a = shz.a();
            synchronized (blz.class) {
                if (blz.D0 == null) {
                    blz.D0 = new alz();
                }
                final ejz ejz = (ejz)((pye)blz.D0).b((Object)a);
                monitorexit(blz.class);
                monitorexit(blz.class);
            }
        }
    }
}
