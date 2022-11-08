// 
// Decompiled by Procyon v0.6.0
// 

public final class glx extends asr<jlx>
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public glx(final String s, final jlx jlx) {
        zzd.f((Object)s, "id");
        zzd.f((Object)jlx, "properties");
        super(s, (lsr)jlx);
    }
    
    public static final class a
    {
    }
    
    public static final class b extends asr$a<glx, jlx>
    {
        public final asr g(final String s, final lsr lsr) {
            final jlx jlx = (jlx)lsr;
            zzd.f((Object)s, "id");
            zzd.f((Object)jlx, "properties");
            return new glx(s, jlx);
        }
    }
}
