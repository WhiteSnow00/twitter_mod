import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import com.twitter.media.ui.image.c;
import com.twitter.nft.subsystem.model.NFTSmartContract;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import com.twitter.nft.subsystem.model.NFTOpenseaCollectionMetadata;
import com.twitter.nft.subsystem.model.NFTCollection;
import com.twitter.nft.subsystem.model.Network;
import java.util.Locale;
import com.twitter.nft.subsystem.model.NFTSmartContract$ERC1155;
import com.twitter.nft.subsystem.model.NFTSmartContract$ERC721;
import com.twitter.media.ui.image.AnimatedGifView$b;
import com.twitter.media.ui.image.AnimatedGifView$c;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l2i extends ste implements qsb<n2i, fzv>
{
    public final g2i D0;
    public final View E0;
    
    public l2i(final g2i d0, final View e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final n2i n2i = (n2i)o;
        czd.f((Object)n2i, "$this$distinct");
        final c0i a = n2i.a;
        if (a != null) {
            final b4i a2 = a.a;
            if (a2 != null) {
                final g2i d0 = this.D0;
                final View e0 = this.E0;
                final String d2 = a2.b.d;
                if (d2 != null) {
                    d0.I0.setImageUrlProvider((AnimatedGifView$c)new wo(d2));
                    d0.I0.setListener((AnimatedGifView$b)new k2i());
                }
                final NFTCollection h = a2.b.h;
                final String s = null;
                final String s2 = null;
                String imageUrl = null;
                Label_0125: {
                    if (h != null) {
                        final NFTOpenseaCollectionMetadata metadata = h.getMetadata();
                        if (metadata != null) {
                            imageUrl = metadata.getImageUrl();
                            break Label_0125;
                        }
                    }
                    imageUrl = null;
                }
                final FrescoMediaImageView k0 = d0.K0;
                int visibility;
                if (imageUrl == null || imageUrl.length() == 0) {
                    visibility = 8;
                }
                else {
                    visibility = 0;
                }
                ((View)k0).setVisibility(visibility);
                ((c)d0.K0).p(x7d.g(imageUrl));
                final TypefacesTextView o2 = d0.O0;
                final String a3 = a2.b.a;
                String text;
                if (a3 == null || a3.length() == 0) {
                    text = hmg.h("#", a2.a);
                }
                else {
                    text = a2.b.a;
                }
                ((TextView)o2).setText((CharSequence)text);
                final NFTCollection h2 = a2.b.h;
                Boolean verified = null;
                Label_0282: {
                    if (h2 != null) {
                        final NFTOpenseaCollectionMetadata metadata2 = h2.getMetadata();
                        if (metadata2 != null) {
                            verified = metadata2.getVerified();
                            break Label_0282;
                        }
                    }
                    verified = null;
                }
                final NFTSmartContract c = a2.c;
                Network network;
                if (c instanceof NFTSmartContract$ERC721) {
                    czd.d((Object)c, "null cannot be cast to non-null type com.twitter.nft.subsystem.model.NFTSmartContract.ERC721");
                    network = ((NFTSmartContract$ERC721)c).getNetwork();
                }
                else {
                    if (!(c instanceof NFTSmartContract$ERC1155)) {
                        final NFTSmartContract c2 = a2.c;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported contract ");
                        sb.append(c2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    czd.d((Object)c, "null cannot be cast to non-null type com.twitter.nft.subsystem.model.NFTSmartContract.ERC1155");
                    network = ((NFTSmartContract$ERC1155)c).getNetwork();
                }
                final String string = network.toString();
                final boolean b = string.length() > 0;
                String string2 = string;
                if (b) {
                    final StringBuilder sb2 = new StringBuilder();
                    final String value = String.valueOf(string.charAt(0));
                    czd.d((Object)value, "null cannot be cast to non-null type java.lang.String");
                    final String upperCase = value.toUpperCase(Locale.ROOT);
                    czd.e((Object)upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    sb2.append((Object)upperCase);
                    final String substring = string.substring(1);
                    czd.e((Object)substring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(substring);
                    string2 = sb2.toString();
                }
                final String h3 = hmg.h("  \u2022  ", string2);
                if (czd.a((Object)verified, (Object)Boolean.TRUE)) {
                    ((TextView)d0.N0).setText((CharSequence)e0.getContext().getString(2131955386));
                    ((View)d0.N0).setVisibility(0);
                }
                else {
                    ((View)d0.N0).setVisibility(8);
                }
                if (network == Network.Ethereum) {
                    final TypefacesTextView m0 = d0.M0;
                    final NFTCollection h4 = a2.b.h;
                    String name = s2;
                    if (h4 != null) {
                        name = h4.getName();
                    }
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(name);
                    sb3.append("  \u2022  ");
                    ((TextView)m0).setText((CharSequence)sb3.toString());
                    ((AppCompatTextView)d0.M0).setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231525, 0);
                }
                else {
                    final TypefacesTextView m2 = d0.M0;
                    final NFTCollection h5 = a2.b.h;
                    String name2 = s;
                    if (h5 != null) {
                        name2 = h5.getName();
                    }
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append(name2);
                    sb4.append(h3);
                    ((TextView)m2).setText((CharSequence)sb4.toString());
                    ((AppCompatTextView)d0.M0).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }
        }
        return fzv.a;
    }
}
