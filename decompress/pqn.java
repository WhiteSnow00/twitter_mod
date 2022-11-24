import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import com.twitter.rooms.json.JsonUserResult;
import com.twitter.rooms.json.JsonRecommendedSpaceTopicsResponse;
import com.twitter.rooms.json.JsonClipMetadata;
import com.twitter.rooms.json.JsonBrowseSpaceTopicsResponse;
import com.twitter.rooms.json.JsonBrowseSpaceTopicsCategories;
import com.twitter.rooms.json.JsonAudioSpaceTweetResults;
import com.twitter.rooms.json.JsonAudioSpaceTopicItem;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import com.twitter.rooms.json.JsonAudioSpaceTopicCategory;
import com.twitter.rooms.json.JsonAudioSpaceTopic;
import com.twitter.rooms.json.JsonAudioSpaceSharingsResponse;
import com.twitter.rooms.json.JsonAudioSpaceSharing;
import com.twitter.rooms.json.JsonAudioSpaceSharedTweet;
import com.twitter.rooms.json.JsonAudioSpaceParticipants;
import com.twitter.rooms.json.JsonAudioSpaceParticipant;
import com.twitter.rooms.json.JsonAudioSpaceMetadata;
import com.twitter.rooms.json.JsonAudioSpaceIsSubscribed;
import com.twitter.rooms.json.JsonAudioSpaceInterestTopic;
import com.twitter.rooms.json.JsonAudioSpace;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry$b;
import com.twitter.model.json.common.JsonModelRegistry$Registrar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqn implements JsonModelRegistry$Registrar
{
    public final void a(final JsonModelRegistry$b jsonModelRegistry$b) {
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)jsonModelRegistry$b;
        jsonModelRegistry$a.b((Class)v01.class, (Class)JsonAudioSpace.class, (gra)null);
        jsonModelRegistry$a.b((Class)u21.class, (Class)JsonAudioSpaceInterestTopic.class, (gra)null);
        jsonModelRegistry$a.b((Class)v21.class, (Class)JsonAudioSpaceIsSubscribed.class, (gra)null);
        jsonModelRegistry$a.b((Class)x21.class, (Class)JsonAudioSpaceMetadata.class, (gra)null);
        jsonModelRegistry$a.b((Class)y21.class, (Class)JsonAudioSpaceParticipant.class, (gra)null);
        jsonModelRegistry$a.b((Class)z21.class, (Class)JsonAudioSpaceParticipants.class, (gra)null);
        jsonModelRegistry$a.b((Class)c31.a.class, (Class)JsonAudioSpaceSharedTweet.class, (gra)null);
        jsonModelRegistry$a.b((Class)e31.class, (Class)JsonAudioSpaceSharing.class, (gra)null);
        jsonModelRegistry$a.b((Class)h31.class, (Class)JsonAudioSpaceSharingsResponse.class, (gra)null);
        jsonModelRegistry$a.b((Class)n31.class, (Class)JsonAudioSpaceTopic.class, (gra)null);
        jsonModelRegistry$a.b((Class)p31.class, (Class)JsonAudioSpaceTopicCategory.class, (gra)null);
        jsonModelRegistry$a.b((Class)AudioSpaceTopicItem.class, (Class)JsonAudioSpaceTopicItem.class, (gra)null);
        jsonModelRegistry$a.b((Class)q31.class, (Class)JsonAudioSpaceTweetResults.class, (gra)null);
        jsonModelRegistry$a.b((Class)op2.class, (Class)JsonBrowseSpaceTopicsCategories.class, (gra)null);
        jsonModelRegistry$a.b((Class)qp2.class, (Class)JsonBrowseSpaceTopicsResponse.class, (gra)null);
        jsonModelRegistry$a.b((Class)li4.class, (Class)JsonClipMetadata.class, (gra)null);
        jsonModelRegistry$a.b((Class)g5m.class, (Class)JsonRecommendedSpaceTopicsResponse.class, (gra)null);
        jsonModelRegistry$a.b((Class)bjw.class, (Class)JsonUserResult.class, (gra)null);
        jsonModelRegistry$a.c((Class)c31.class, (TypeConverter)new d31());
    }
}
