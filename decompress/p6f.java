import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p6f implements zjr
{
    public static final String[] a;
    
    static {
        a = new String[] { "mediaRestrictions", "altText", "mediaStats", "mediaColor", "info360", "highlightedLabel" };
    }
    
    public final Set<String> a() {
        final LinkedHashSet set = new LinkedHashSet((Collection<? extends E>)Arrays.asList(p6f.a));
        if (ita.b().b("creator_android_nft_avatar_http_include_enabled", false)) {
            set.add("hasNftAvatar");
        }
        if (ita.b().b("android_audio_spaces_device_follow_user_api_enabled", false)) {
            set.add("spaceDeviceFollowMetadata");
        }
        if (ita.b().b("dont_mention_me_view_api_enabled", false)) {
            set.add("unmentionInfo");
        }
        return set;
    }
}
