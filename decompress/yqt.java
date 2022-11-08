import android.os.BaseBundle;
import java.util.Objects;
import java.util.Map;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yqt extends qrs
{
    public static final yqt.yqt$b Companion;
    
    static {
        Companion = new yqt.yqt$b();
    }
    
    public yqt(final Bundle bundle) {
        super(bundle);
    }
    
    public final String j() {
        String string;
        if ((string = ((BaseBundle)((zl1)this).a).getString("scribe_page")) == null) {
            string = "topics_timeline";
        }
        return string;
    }
    
    public final String l() {
        return "";
    }
    
    public final int n() {
        return 46;
    }
    
    public final tpv o() {
        final sjg t = sjg.t();
        t.w((Object)"arg_topic_id", (Object)((BaseBundle)((zl1)this).a).getString("arg_topic_id"));
        final String string = ((BaseBundle)((zl1)this).a).getString("arg_data_lookup_id");
        if (string != null && string.length() != 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("tweet:");
            sb.append(string);
            t.w((Object)"arg_data_lookup_id", (Object)sb.toString());
        }
        return new tpv((Map)((h4j)t).e());
    }
    
    public final boolean q() {
        return false;
    }
    
    public static final class a extends qrs$a<yqt, a>
    {
        public static final a.yqt$a$a Companion;
        
        static {
            Companion = new a.yqt$a$a();
        }
        
        public a(final Bundle bundle) {
            super(bundle);
        }
        
        public final Object i() {
            final yqt.yqt$b companion = yqt.Companion;
            final Bundle a = ((zl1$a)this).a;
            Objects.requireNonNull(companion);
            return new yqt(a);
        }
    }
}
