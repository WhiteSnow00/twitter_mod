import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yy7 implements wqa<v3e<wx7$g, p08$a>>
{
    public static v3e<wx7$g, p08$a> a(final Resources resources, final zml<dw7> zml, final zml<wz7> zml2) {
        final xy7 xy7 = (xy7)ca7.u((Class)xy7.class);
        zzd.f((Object)resources, "resources");
        zzd.f((Object)zml, "contentViewIntentSubject");
        zzd.f((Object)zml2, "pageViewIntentSubject");
        Object o;
        Object o2;
        if (poa.P()) {
            o = new oy7(zml2);
            o2 = new py7((zml)zml2);
        }
        else {
            final qy7 qy7 = new qy7((zml)zml);
            o2 = new ry7((zml)zml);
            o = qy7;
        }
        return (v3e<wx7$g, p08$a>)new p08(resources, (rtb)o, (rtb)o2);
    }
}
