import org.apache.thrift.TException;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zyo
{
    public static final alp<zyo> b;
    public final jg4 a;
    
    static {
        zyo.b = new a();
    }
    
    public zyo(final jg4 a) {
        this.a = a;
    }
    
    public final void a(final tfe tfe) throws IOException {
        final byte[] z0 = m0n.z0((n5s)this.a);
        if (z0 != null) {
            tfe.i("client_media_event_binary");
            tfe.c(wi1.a, z0, z0.length);
        }
    }
    
    public static final class a extends s4j<zyo>
    {
        public final Object d(elp elp, int length) throws IOException, ClassNotFoundException {
            final byte[] w = elp.w();
            Object o = null;
            if (w != null) {
                final jg4 jg4 = new jg4();
                jg4 jg5;
                try {
                    elp = (elp)new v5s();
                    final p5s p5s = new p5s((y5s)elp, -1L, -1L);
                    length = w.length;
                    try {
                        ((v5s)elp).C0 = w;
                        ((v5s)elp).D0 = 0;
                        ((v5s)elp).E0 = length + 0;
                        ((x5s)jg4).f((w5s)p5s);
                    }
                    finally {
                        ((v5s)elp).C0 = null;
                    }
                }
                catch (final TException ex) {
                    e9a.d((Throwable)ex);
                    jg5 = null;
                }
                o = o;
                if (jg5 != null) {
                    o = new zyo(jg5);
                }
            }
            return o;
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            flp.v(m0n.z0((n5s)((zyo)o).a));
        }
    }
}
