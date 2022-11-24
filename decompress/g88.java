import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.util.Objects;
import android.net.Uri;
import android.util.Base64;
import com.facebook.imagepipeline.request.a;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g88 extends w4g
{
    public g88(final grk grk) {
        super((Executor)gb3.F0, grk);
    }
    
    public final l4a c(final a a) throws IOException {
        final String string = a.b.toString();
        xd.D(string.substring(0, 5).equals("data:"));
        final int index = string.indexOf(44);
        final String substring = string.substring(index + 1, string.length());
        final String substring2 = string.substring(0, index);
        boolean equals;
        if (!substring2.contains(";")) {
            equals = false;
        }
        else {
            final String[] split = substring2.split(";");
            equals = split[split.length - 1].equals("base64");
        }
        byte[] array;
        if (equals) {
            array = Base64.decode(substring, 0);
        }
        else {
            final String decode = Uri.decode(substring);
            Objects.requireNonNull(decode);
            array = decode.getBytes();
        }
        return this.b((InputStream)new ByteArrayInputStream(array), array.length);
    }
    
    public final String d() {
        return "DataFetchProducer";
    }
}
