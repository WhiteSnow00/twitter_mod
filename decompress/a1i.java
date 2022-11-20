import androidx.fragment.app.s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import com.twitter.nft.subsystem.api.args.NFTGalleryFragmentContentViewArgs;
import java.util.Objects;
import androidx.appcompat.widget.Toolbar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a1i extends ste implements qsb<b1i, fzv>
{
    public final x0i D0;
    
    public a1i(final x0i d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final b1i b1i = (b1i)o;
        czd.f((Object)b1i, "$this$distinct");
        final Object value = this.D0.G0.getValue();
        czd.e(value, "<get-toolbar>(...)");
        ((Toolbar)value).setTitle((CharSequence)b1i.a);
        final String b = b1i.b;
        if (b != null && b.length() != 0) {
            final x0i d0 = this.D0;
            Objects.requireNonNull(d0);
            final NFTGalleryFragmentContentViewArgs instance = NFTGalleryFragmentContentViewArgs.INSTANCE;
            final String name = NFTGalleryFragmentContentViewArgs.class.getName();
            if (d0.F0.H(name) == null) {
                final Fragment b2 = d0.E0.b(instance);
                final a a = new a(d0.F0);
                ((s)a).g(2131430249, b2, name);
                a.c();
            }
        }
        return fzv.a;
    }
}
