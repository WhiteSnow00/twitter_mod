import android.os.ParcelFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.FileInputStream;
import android.provider.ContactsContract$Contacts;
import java.io.IOException;
import com.facebook.imagepipeline.request.a;
import java.util.concurrent.Executor;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m3g extends b4g
{
    public final ContentResolver c;
    
    public m3g(final Executor executor, final uqk uqk, final ContentResolver c) {
        super(executor, uqk);
        this.c = c;
    }
    
    @Override
    public final j3a c(final a a) throws IOException {
        final Uri b = a.b;
        final Uri a2 = z5w.a;
        boolean b2 = false;
        Label_0061: {
            if (b.getPath() != null) {
                if (z5w.c(b) && "com.android.contacts".equals(b.getAuthority()) && !b.getPath().startsWith(z5w.a.getPath())) {
                    b2 = true;
                    break Label_0061;
                }
            }
            b2 = false;
        }
        if (b2) {
            InputStream inputStream;
            if (b.toString().endsWith("/photo")) {
                inputStream = this.c.openInputStream(b);
            }
            else {
                if (b.toString().endsWith("/display_photo")) {
                    try {
                        inputStream = this.c.openAssetFileDescriptor(b, "r").createInputStream();
                        return this.b(inputStream, -1);
                    }
                    catch (final IOException ex) {
                        throw new IOException(k6e.f("Contact photo does not exist: ", b));
                    }
                }
                inputStream = ContactsContract$Contacts.openContactPhotoInputStream(this.c, b);
                if (inputStream == null) {
                    throw new IOException(k6e.f("Contact photo does not exist: ", b));
                }
            }
            return this.b(inputStream, -1);
        }
        if (z5w.b(b)) {
            j3a b3;
            try {
                final ParcelFileDescriptor openFileDescriptor = this.c.openFileDescriptor(b, "r");
                b3 = this.b(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int)openFileDescriptor.getStatSize());
            }
            catch (final FileNotFoundException ex2) {
                b3 = null;
            }
            if (b3 != null) {
                return b3;
            }
        }
        return this.b(this.c.openInputStream(b), -1);
    }
    
    @Override
    public final String d() {
        return "LocalContentUriFetchProducer";
    }
}
