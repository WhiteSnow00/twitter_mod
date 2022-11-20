import com.twitter.narrowcast.args.NarrowcastBottomSheetCommunityPickerFragmentArgs$Action;
import com.twitter.narrowcast.args.NarrowcastBottomSheetCommunityPickerFragmentArgs$Action$ComposeAttachmentTweet;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jhg implements moa$b
{
    public final obi<?> a;
    public final g9i b;
    public final ufg c;
    public final moa.a d;
    
    public jhg(final obi<?> a, final g9i b, final ufg c, final moa.a d) {
        czd.f((Object)a, "navigator");
        czd.f((Object)b, "narrowcastTweetTextComposerEntryPoint");
        czd.f((Object)c, "pageInfoAdapter");
        czd.f((Object)d, "fallbackFabMenuNavigationDelegate");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final vqg vqg, final String s, final int[] array) {
        czd.f((Object)vqg, "mediaAttachment");
        if (this.c()) {
            final g9i b = this.b;
            final r89 b2 = vqg.b;
            czd.e((Object)b2, "mediaAttachment.draft");
            Objects.requireNonNull(b);
            b.b((NarrowcastBottomSheetCommunityPickerFragmentArgs$Action)new NarrowcastBottomSheetCommunityPickerFragmentArgs$Action$ComposeAttachmentTweet(b2));
        }
        else {
            this.d.b(vqg.b, s, array);
        }
    }
    
    public final void b(final r89 r89, final String s, final int[] array) {
        if (this.c()) {
            final g9i b = this.b;
            Objects.requireNonNull(b);
            b.b((NarrowcastBottomSheetCommunityPickerFragmentArgs$Action)new NarrowcastBottomSheetCommunityPickerFragmentArgs$Action$ComposeAttachmentTweet(r89));
        }
        else {
            this.d.b(r89, s, array);
        }
    }
    
    public final boolean c() {
        final jsj w = ((osj)this.c).w();
        return w != null && w.a == mfg.g && this.b.a();
    }
    
    public final obi<?> h() {
        return this.a;
    }
}
