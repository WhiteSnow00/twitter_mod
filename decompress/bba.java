// 
// Decompiled by Procyon v0.6.0
// 

public interface bba extends baa
{
    public static final a Companion;
    public static final cba c = (cba)(Companion = a.a).b("", "", "", "");
    public static final rlp<bba> d = new dba();
    
    String c();
    
    public static final class a
    {
        public static final a a;
        
        static {
            a = new a();
        }
        
        public final bba a(final baa baa, final String s) {
            czd.f((Object)baa, "eventComponentPrefix");
            return (bba)new cba(((bca)baa).b(), ((ica)baa).d(), baa.a(), s);
        }
        
        public final bba b(final String s, final String s2, final String s3, final String s4) {
            czd.f((Object)s, "page");
            czd.f((Object)s2, "section");
            czd.f((Object)s3, "component");
            czd.f((Object)s4, "element");
            return (bba)new cba(s, s2, s3, s4);
        }
    }
}
