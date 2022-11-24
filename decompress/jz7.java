import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jz7 implements bra<b4e<hy7$g, b18$a>>
{
    public static b4e<hy7$g, b18$a> a(final Resources resources, final znl<pw7> znl, final znl<h08> znl2) {
        final iz7 iz7 = (iz7)lp7.m0((Class)iz7.class);
        e0e.f((Object)resources, "resources");
        e0e.f((Object)znl, "contentViewIntentSubject");
        e0e.f((Object)znl2, "pageViewIntentSubject");
        Object o;
        Object o2;
        if (lmi.p()) {
            final zy7 zy7 = new zy7((znl)znl2);
            o = new az7(znl2);
            o2 = zy7;
        }
        else {
            o2 = new bz7((znl)znl);
            o = new cz7((znl)znl);
        }
        return (b4e<hy7$g, b18$a>)new b18(resources, (stb)o2, (stb)o);
    }
}
