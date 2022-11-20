import com.twitter.app.profiles.di.view.ProfileSheetViewObjectGraph;
import android.content.DialogInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class ddl extends e92
{
    public final void onShow(final DialogInterface dialogInterface) {
        super.onShow(dialogInterface);
        final xdl b = ((ProfileSheetViewObjectGraph)((smd)this).n()).b();
        final efv l = b.l;
        if (l != null) {
            final af4 af4 = new af4();
            ((u0p)af4).C = String.valueOf(b.h.getId());
            final int a = c5j.a;
            ((u0p)af4).T = vba.g(((lzo)l).d, ((lzo)l).e, "profile_modal", "", "impression").toString();
            cbw.b((elm)af4);
        }
    }
}
