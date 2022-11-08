import com.twitter.android.av.monetization.MediaMonetizationContentViewResult;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vwg implements bsm<swg>
{
    @Override
    public final Object c(final Intent intent) {
        swg mediaMonetizationMetadata;
        if (intent == null) {
            mediaMonetizationMetadata = (swg)((h4j)new swg$a()).e();
        }
        else {
            final MediaMonetizationContentViewResult mediaMonetizationContentViewResult = (MediaMonetizationContentViewResult)ln6.f(intent.getExtras(), (Class)MediaMonetizationContentViewResult.class);
            if (mediaMonetizationContentViewResult == null) {
                mediaMonetizationMetadata = (swg)((h4j)new swg$a()).e();
            }
            else {
                mediaMonetizationMetadata = mediaMonetizationContentViewResult.getMediaMonetizationMetadata();
            }
        }
        return mediaMonetizationMetadata;
    }
}
