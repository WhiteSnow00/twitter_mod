// 
// Decompiled by Procyon v0.6.0
// 

public final class glj extends asr<ilj>
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public glj(final String s, final ilj ilj) {
        zzd.f((Object)s, "id");
        zzd.f((Object)ilj, "properties");
        super(s, (lsr)ilj);
    }
    
    public static final class a
    {
    }
    
    public static final class b extends asr$a<glj, ilj>
    {
        public final asr g(final String s, final lsr lsr) {
            final ilj ilj = (ilj)lsr;
            zzd.f((Object)s, "id");
            zzd.f((Object)ilj, "properties");
            return new glj(s, ilj);
        }
    }
}
