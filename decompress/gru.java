// 
// Decompiled by Procyon v0.6.0
// 

public final class gru extends asr<iru>
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public gru(final String s, final iru iru) {
        zzd.f((Object)s, "id");
        zzd.f((Object)iru, "properties");
        super(s, (lsr)iru);
    }
    
    public static final class a
    {
    }
    
    public static final class b extends asr$a<gru, iru>
    {
        public final asr g(final String s, final lsr lsr) {
            final iru iru = (iru)lsr;
            zzd.f((Object)s, "id");
            zzd.f((Object)iru, "properties");
            return new gru(s, iru);
        }
    }
}
