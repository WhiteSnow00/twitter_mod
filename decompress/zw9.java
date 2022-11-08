import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zw9
{
    public static final zw9.zw9$a Companion;
    public static final e g;
    public final List<zw9$b> a;
    public final bg1 b;
    public final zw9$b$b c;
    public final en6 d;
    public final float e;
    public final String f;
    
    static {
        Companion = new zw9.zw9$a();
        g = e.b;
    }
    
    public zw9(final List<? extends zw9$b> a, final bg1 b, final zw9$b$b c, final en6 d, final float e, final String f) {
        zzd.f((Object)d, "contentType");
        this.a = (List<zw9$b>)a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zw9)) {
            return false;
        }
        final zw9 zw9 = (zw9)o;
        return zzd.a((Object)this.a, (Object)zw9.a) && zzd.a((Object)this.b, (Object)zw9.b) && zzd.a((Object)this.c, (Object)zw9.c) && this.d == zw9.d && Float.compare(this.e, zw9.e) == 0 && zzd.a((Object)this.f, (Object)zw9.f);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final zw9$b$b c = this.c;
        final int n = 0;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final int h = c0.h(this.e, (this.d.hashCode() + ((hashCode2 + hashCode * 31) * 31 + hashCode3) * 31) * 31, 31);
        final String f = this.f;
        int hashCode4;
        if (f == null) {
            hashCode4 = n;
        }
        else {
            hashCode4 = f.hashCode();
        }
        return h + hashCode4;
    }
    
    @Override
    public final String toString() {
        final List<zw9$b> a = this.a;
        final bg1 b = this.b;
        final zw9$b$b c = this.c;
        final en6 d = this.d;
        final float e = this.e;
        final String f = this.f;
        final StringBuilder sb = new StringBuilder();
        sb.append("EditablePendingFleet(overlays=");
        sb.append(a);
        sb.append(", backgroundColor=");
        sb.append(b);
        sb.append(", media=");
        sb.append(c);
        sb.append(", contentType=");
        sb.append(d);
        sb.append(", aspectRatio=");
        sb.append(e);
        sb.append(", altText=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class c implements KSerializer<zw9>
    {
        public static final c b;
        
        static {
            b = new c();
        }
        
        public c() {
            this.a = (ate$a)ate.b((alp)e.b);
        }
        
        public final Object deserialize(final Decoder decoder) {
            zzd.f((Object)decoder, "decoder");
            return this.a.deserialize(decoder);
        }
        
        public final SerialDescriptor getDescriptor() {
            return (SerialDescriptor)this.a.b;
        }
        
        public final void serialize(final Encoder encoder, final Object o) {
            final zw9 zw9 = (zw9)o;
            zzd.f((Object)encoder, "encoder");
            zzd.f((Object)zw9, "value");
            this.a.serialize(encoder, (Object)zw9);
        }
    }
    
    public abstract static class d
    {
        public static final a Companion;
        
        static {
            Companion = new a();
        }
        
        public static final class a
        {
        }
        
        public static final class c extends s4j<d>
        {
            public static final c b;
            
            static {
                b = new c();
            }
            
            public final Object d(final elp elp, int z) {
                zzd.f((Object)elp, "input");
                final String i = elp.I();
                final gvj gvj = null;
                final Object o = null;
                abm abm = null;
                Object o2;
                if (i == null) {
                    o2 = o;
                }
                else if (zzd.a((Object)i, (Object)zw9$d$b.class.getSimpleName())) {
                    z = elp.z();
                    if (!tkp.c(elp)) {
                        abm = new abm(elp.y(), elp.y(), elp.y(), elp.y());
                    }
                    zzd.c((Object)abm);
                    o2 = new zw9$d$b(z, abm);
                }
                else {
                    o2 = o;
                    if (zzd.a((Object)i, (Object)zw9$d$d.class.getSimpleName())) {
                        final hx6$i b = hx6.b;
                        final Integer n = (Integer)((bow)b).a(elp);
                        final Integer n2 = (Integer)((bow)b).a(elp);
                        gvj gvj2 = gvj;
                        if (n != null) {
                            gvj2 = gvj;
                            if (n2 != null) {
                                gvj2 = new gvj((Object)n, (Object)n2);
                            }
                        }
                        o2 = new zw9$d$d(gvj2, elp.u());
                    }
                }
                return o2;
            }
            
            public final String e() {
                return d.class.getSimpleName();
            }
            
            public final void f(final flp flp, final Object o) {
                final d d = (d)o;
                zzd.f((Object)flp, "output");
                zzd.f((Object)d, "object");
                if (d instanceof zw9$d$b) {
                    flp.G(zw9$d$b.class.getSimpleName());
                    final zw9$d$b zw9$d$b = (zw9$d$b)d;
                    flp.z(zw9$d$b.a);
                    ((bow)abm.e).c(flp, (Object)zw9$d$b.b);
                }
                else if (d instanceof zw9$d$d) {
                    flp.G(zw9$d$d.class.getSimpleName());
                    final zw9$d$d zw9$d$d = (zw9$d$d)d;
                    final gvj a = zw9$d$d.a;
                    final Object o2 = null;
                    Integer n;
                    if (a != null) {
                        n = (Integer)a.C0;
                    }
                    else {
                        n = null;
                    }
                    final hx6$i b = hx6.b;
                    ((bow)b).c(flp, (Object)n);
                    final int a2 = w4j.a;
                    final gvj a3 = zw9$d$d.a;
                    Object o3 = o2;
                    if (a3 != null) {
                        o3 = a3.D0;
                    }
                    ((bow)b).c(flp, o3);
                    flp.t(zw9$d$d.b);
                }
            }
        }
    }
    
    public static final class e extends s4j<zw9>
    {
        public static final e b;
        public static final alp<List<zw9$b>> c;
        
        static {
            b = new e();
            e.c = new xq4$a((alp)zw9$b$a.a.b);
        }
        
        public final Object d(final elp elp, final int n) {
            zzd.f((Object)elp, "input");
            final List list = (List)((s4j)e.c).a(elp);
            if (list != null) {
                final bg1 bg1 = (bg1)((s4j)bg1$f$a.b).a(elp);
                if (bg1 != null) {
                    final Object a = ((s4j)zw9$b$a.a.b).a(elp);
                    zw9$b$b zw9$b$b;
                    if (a instanceof zw9$b$b) {
                        zw9$b$b = (zw9$b$b)a;
                    }
                    else {
                        zw9$b$b = null;
                    }
                    final String i = elp.I();
                    if (i != null) {
                        return new zw9(list, bg1, zw9$b$b, en6.valueOf(i), elp.y(), elp.I());
                    }
                }
            }
            return null;
        }
        
        public final String e() {
            return zw9.class.getSimpleName();
        }
        
        public final void f(final flp flp, final Object o) {
            final zw9 zw9 = (zw9)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)zw9, "object");
            ((s4j)e.c).c(flp, (Object)zw9.a);
            final int a = w4j.a;
            ((s4j)bg1$f$a.b).c(flp, (Object)zw9.b);
            ((s4j)zw9$b$a.a.b).c(flp, (Object)zw9.c);
            flp.G(((Enum)zw9.d).name());
            flp.y(zw9.e);
            flp.G(zw9.f);
        }
    }
}
