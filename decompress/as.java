import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class as implements ews
{
    public final String a;
    public final String b;
    public final List<kus.a<?, ?>> c;
    public final boolean d;
    
    public as(final List<? extends kus.a<?, ?>> c, final yuv yuv) {
        zzd.f((Object)yuv, "unhydratedInstruction");
        final String a = yuv.a;
        final String b = yuv.b;
        final boolean d = yuv.d;
        this.a = a;
        this.b = b;
        this.c = (List<kus.a<?, ?>>)c;
        this.d = d;
    }
    
    public static final class a implements std
    {
        public final List<kus> a;
        
        public a(final List<? extends kus> list) {
            zzd.f((Object)list, "timelineEntities");
            this.a = or4.m2((Iterable)list);
        }
        
        public final boolean a() {
            return this.a.isEmpty() ^ true;
        }
    }
}
