// 
// Decompiled by Procyon v0.6.0
// 

public interface ada extends tca
{
    public static final a Companion;
    public static final cda e = (cda)(Companion = a.a).a("", "");
    
    String d();
    
    public static final class a
    {
        public static final /* synthetic */ a a;
        
        static {
            a = new a();
        }
        
        public final ada a(final String s, final String s2) {
            zzd.f((Object)s, "page");
            zzd.f((Object)s2, "section");
            return new cda(s, s2);
        }
    }
}
