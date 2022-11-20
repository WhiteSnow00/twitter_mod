import kotlin.NoWhenBranchMatchedException;
import com.twitter.narrowcast.args.NarrowcastBottomSheetCommunityPickerFragmentArgs$Action$ComposeQuotedTweet;
import com.twitter.narrowcast.args.NarrowcastBottomSheetCommunityPickerFragmentArgs$Action$ComposeTextTweet;
import java.util.List;
import com.twitter.narrowcast.args.NarrowcastBottomSheetCommunityPickerFragmentArgs$Action$ComposeAttachmentTweet;
import com.twitter.narrowcast.args.NarrowcastBottomSheetCommunityPickerFragmentArgs$Action;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i8i
{
    public final z66 a(final h9i$a h9i$a, final NarrowcastBottomSheetCommunityPickerFragmentArgs$Action narrowcastBottomSheetCommunityPickerFragmentArgs$Action) {
        czd.f((Object)h9i$a, "community");
        czd.f((Object)narrowcastBottomSheetCommunityPickerFragmentArgs$Action, "action");
        z66 z66;
        if (narrowcastBottomSheetCommunityPickerFragmentArgs$Action instanceof NarrowcastBottomSheetCommunityPickerFragmentArgs$Action$ComposeAttachmentTweet) {
            z66 = this.b(h9i$a);
            z66.j(rif.v((Object)((NarrowcastBottomSheetCommunityPickerFragmentArgs$Action$ComposeAttachmentTweet)narrowcastBottomSheetCommunityPickerFragmentArgs$Action).getSelectedMedia()));
        }
        else if (narrowcastBottomSheetCommunityPickerFragmentArgs$Action instanceof NarrowcastBottomSheetCommunityPickerFragmentArgs$Action$ComposeTextTweet) {
            z66 = this.b(h9i$a);
            z66.r(null, 0);
            z66.g(1);
        }
        else {
            if (!(narrowcastBottomSheetCommunityPickerFragmentArgs$Action instanceof NarrowcastBottomSheetCommunityPickerFragmentArgs$Action$ComposeQuotedTweet)) {
                throw new NoWhenBranchMatchedException();
            }
            z66 = this.b(h9i$a);
            z66.m(((NarrowcastBottomSheetCommunityPickerFragmentArgs$Action$ComposeQuotedTweet)narrowcastBottomSheetCommunityPickerFragmentArgs$Action).getQuotedTweet().b());
            z66.g(1);
        }
        return z66;
    }
    
    public final z66 b(final h9i$a h9i$a) {
        final z66 z66 = new z66();
        z66.k((h9i)h9i$a);
        z66.q(false);
        return z66;
    }
}
