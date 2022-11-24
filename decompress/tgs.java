// 
// Decompiled by Procyon v0.6.0
// 

public final class tgs
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public static final class a
    {
        public final gjs a(final ajs ajs, final sis sis, final it9 it9, final aad aad, final stb<? super sis, vzv> stb, final stb<? super z9d, vzv> stb2) {
            e0e.f((Object)ajs, "textInputService");
            e0e.f((Object)sis, "value");
            e0e.f((Object)it9, "editProcessor");
            e0e.f((Object)aad, "imeOptions");
            e0e.f((Object)stb, "onValueChange");
            e0e.f((Object)stb2, "onImeActionPerformed");
            final e8m e8m = new e8m();
            ajs.a.a(sis, aad, (stb)new tgs$a$a(it9, (stb)stb, e8m), (stb)stb2);
            final gjs f0 = new gjs(ajs, ajs.a);
            ajs.b.set(f0);
            return (gjs)(e8m.F0 = f0);
        }
    }
}
