import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dz8 extends gue implements otb<oyv>
{
    public final /* synthetic */ gz8 C0;
    public final /* synthetic */ oii D0;
    public final /* synthetic */ jev E0;
    
    public dz8(final gz8 c0, final oii d0, final jev e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(0);
    }
    
    public final Object invoke() {
        final rii c = this.C0.c;
        final oii d0 = this.D0;
        final jev e0 = this.E0;
        Objects.requireNonNull(c);
        zzd.f((Object)d0, "newsletterSource");
        if (zzd.a((Object)d0.C0, (Object)"twitter-profile")) {
            final zf4 zf4 = new zf4(nca.Companion.e("profile", "profile_modules", "newsletter_subscribe", "different_email", "click"));
            final lev$a lev$a = new lev$a();
            final nii$a nii$a = new nii$a();
            nii$a.o(d0.C0);
            lev$a.i1 = (nii)((h4j)nii$a).e();
            zf4.i((szo)((h4j)lev$a).e());
            saw.b((okm)zf4);
        }
        else {
            final nca$a companion = nca.Companion;
            String d2;
            if (e0 == null || (d2 = ((vyo)e0).d) == null) {
                d2 = "";
            }
            String e2;
            if (e0 == null || (e2 = ((vyo)e0).e) == null) {
                e2 = "";
            }
            final zf4 zf5 = new zf4(companion.e(d2, e2, "newsletter_subscribe", "different_email", "click"));
            final lev$a lev$a2 = new lev$a();
            final nii$a nii$a2 = new nii$a();
            nii$a2.o(d0.C0);
            lev$a2.i1 = (nii)((h4j)nii$a2).e();
            zf5.i((szo)((h4j)lev$a2).e());
            saw.b((okm)zf5);
        }
        return oyv.a;
    }
}
