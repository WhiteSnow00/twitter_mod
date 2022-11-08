import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import com.twitter.longform.twitterarticles.json.JsonTwitterArticleUserMention;
import com.twitter.longform.twitterarticles.json.JsonTwitterArticleUrl;
import com.twitter.longform.twitterarticles.json.JsonTwitterArticleTweetEntity;
import com.twitter.longform.twitterarticles.json.JsonTwitterArticleTextStyleWithRange;
import com.twitter.longform.twitterarticles.json.JsonTwitterArticleTextSection;
import com.twitter.longform.twitterarticles.json.JsonTwitterArticleTextEntityWithRange;
import com.twitter.longform.twitterarticles.json.JsonTwitterArticleSymbol;
import com.twitter.longform.twitterarticles.json.JsonTwitterArticlesSliceItem;
import com.twitter.longform.twitterarticles.json.JsonTwitterArticleNonTextSection;
import com.twitter.longform.twitterarticles.json.JsonTwitterArticleMetadata;
import com.twitter.longform.twitterarticles.json.JsonTwitterArticleMediaEntity;
import com.twitter.longform.twitterarticles.json.JsonTwitterArticleHashtag;
import com.twitter.longform.twitterarticles.json.JsonTwitterArticleDataV2;
import com.twitter.longform.twitterarticles.json.JsonTwitterArticleData;
import com.twitter.longform.twitterarticles.json.JsonTwitterArticle;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z7v implements Registrar
{
    @Override
    public final void a(final b b) {
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)b;
        jsonModelRegistry$a.b((Class)q1v.class, (Class)JsonTwitterArticle.class, (bra)null);
        jsonModelRegistry$a.b((Class)c3v.class, (Class)JsonTwitterArticleData.class, (bra)null);
        jsonModelRegistry$a.b((Class)e3v.class, (Class)JsonTwitterArticleDataV2.class, (bra)null);
        jsonModelRegistry$a.b((Class)g3v.class, (Class)JsonTwitterArticleHashtag.class, (bra)null);
        jsonModelRegistry$a.b((Class)x3v.class, (Class)JsonTwitterArticleMediaEntity.class, (bra)null);
        jsonModelRegistry$a.b((Class)b4v.class, (Class)JsonTwitterArticleMetadata.class, (bra)null);
        jsonModelRegistry$a.b((Class)e4v.class, (Class)JsonTwitterArticleNonTextSection.class, (bra)null);
        jsonModelRegistry$a.b((Class)e7v.class, (Class)JsonTwitterArticlesSliceItem.class, (bra)null);
        jsonModelRegistry$a.b((Class)f7v.class, (Class)JsonTwitterArticleSymbol.class, (bra)null);
        jsonModelRegistry$a.b((Class)i7v.class, (Class)JsonTwitterArticleTextEntityWithRange.class, (bra)null);
        jsonModelRegistry$a.b((Class)j7v.class, (Class)JsonTwitterArticleTextSection.class, (bra)null);
        jsonModelRegistry$a.b((Class)m7v.class, (Class)JsonTwitterArticleTextStyleWithRange.class, (bra)null);
        jsonModelRegistry$a.b((Class)o7v.class, (Class)JsonTwitterArticleTweetEntity.class, (bra)null);
        jsonModelRegistry$a.b((Class)t7v.class, (Class)JsonTwitterArticleUrl.class, (bra)null);
        jsonModelRegistry$a.b((Class)u7v.class, (Class)JsonTwitterArticleUserMention.class, (bra)null);
        jsonModelRegistry$a.c((Class)c4v.class, (TypeConverter)new nke());
        jsonModelRegistry$a.c((Class)d4v.class, (TypeConverter)new or5(1));
        jsonModelRegistry$a.c((Class)f4v.class, (TypeConverter)new oke());
        jsonModelRegistry$a.c((Class)c7v.class, (TypeConverter)new pke());
        jsonModelRegistry$a.c((Class)d7v.class, (TypeConverter)new ws5(2));
        jsonModelRegistry$a.c((Class)g7v.class, (TypeConverter)new qke());
        jsonModelRegistry$a.c((Class)h7v.class, (TypeConverter)new qo5(3));
        jsonModelRegistry$a.c((Class)k7v.class, (TypeConverter)new rke());
        jsonModelRegistry$a.c((Class)l7v.class, (TypeConverter)new ske());
        jsonModelRegistry$a.c((Class)x7v.class, (TypeConverter)new vke());
    }
}
