// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.deeplinkdispatch;

import java.io.OutputStream;
import com.airbnb.deeplinkdispatch.base.UtilsKt;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import com.airbnb.deeplinkdispatch.base.Utils;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J \u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\tJ\t\u0010\u000e\u001a\u00020\tH\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003R\u001a\u0010\u000f\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d" }, d2 = { "Lcom/airbnb/deeplinkdispatch/Root;", "Lcom/airbnb/deeplinkdispatch/TreeNode;", "Ljava/io/OutputStream;", "openOutputStream", "Loyv;", "writeToOutoutStream", "", "", "getStrings", "", "deepLinkUriTemplate", "annotatedClassFullyQualifiedName", "annotatedMethod", "addToTrie", "component1", "id", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "deeplinkdispatch-base" }, k = 1, mv = { 1, 5, 1 })
public final class Root extends TreeNode
{
    private final String id;
    
    public Root() {
        this(null, 1, null);
    }
    
    public Root(final String id) {
        zzd.f((Object)id, "id");
        super("r", new NodeMetadata((byte)1, id));
        this.id = id;
    }
    
    public final void addToTrie(final String s, final String s2, final String s3) {
        zzd.f((Object)s, "deepLinkUriTemplate");
        zzd.f((Object)s2, "annotatedClassFullyQualifiedName");
        final DeepLinkUri template = DeepLinkUri.parseTemplate(s);
        final String scheme = template.scheme();
        final Utils instance = Utils.INSTANCE;
        zzd.e((Object)scheme, "it");
        instance.validateIfComponentParam(scheme);
        final TreeNode addNode = this.addNode((TreeNode)new Scheme(scheme));
        final String host = template.host();
        final int n = 0;
        final boolean b = host == null || host.length() == 0;
        TreeNode addNode2 = addNode;
        if (!b) {
            final String host2 = template.host();
            zzd.e((Object)host2, "deepLinkUri.host()");
            instance.validateIfComponentParam(host2);
            final String host3 = template.host();
            zzd.e((Object)host3, "deepLinkUri.host()");
            final TreeNode addNode3 = addNode.addNode((TreeNode)new Host(host3));
            final List pathSegments = template.pathSegments();
            final boolean b2 = pathSegments == null || pathSegments.isEmpty();
            addNode2 = addNode3;
            if (b2) {
                addNode3.setMatch(new UriMatch(s, s2, s3));
                addNode2 = addNode3;
            }
        }
        final List pathSegments2 = template.pathSegments();
        int n2 = 0;
        Label_0249: {
            if (pathSegments2 != null) {
                n2 = n;
                if (!pathSegments2.isEmpty()) {
                    break Label_0249;
                }
            }
            n2 = 1;
        }
        if (n2 == 0) {
            for (final String s4 : template.pathSegments()) {
                final Utils instance2 = Utils.INSTANCE;
                zzd.e((Object)s4, "pathSegment");
                instance2.validateIfComponentParam(s4);
                instance2.validateIfConfigurablePathSegment(s4);
                addNode2 = addNode2.addNode((TreeNode)new PathSegment(s4));
            }
            addNode2.setMatch(new UriMatch(s, s2, s3));
        }
    }
    
    public final String component1() {
        return this.getId();
    }
    
    public final Root copy(final String s) {
        zzd.f((Object)s, "id");
        return new Root(s);
    }
    
    public boolean equals(final Object o) {
        return this == o || (o instanceof Root && zzd.a((Object)this.getId(), (Object)((Root)o).getId()));
    }
    
    public String getId() {
        return this.id;
    }
    
    public final List<CharSequence> getStrings() {
        final byte[] uByteArray-TcUX1vc = this.toUByteArray-TcUX1vc();
        final byte[] copy = Arrays.copyOf(uByteArray-TcUX1vc, uByteArray-TcUX1vc.length);
        zzd.e((Object)copy, "java.util.Arrays.copyOf(this, size)");
        final Charset forName = Charset.forName("ISO_8859_1");
        zzd.e((Object)forName, "forName(MATCH_INDEX_ENCODING)");
        return UtilsKt.chunkOnModifiedUtf8ByteSize((CharSequence)new String(copy, forName), 65535);
    }
    
    public int hashCode() {
        return this.getId().hashCode();
    }
    
    public String toString() {
        final StringBuilder g = w48.g("Root(id=");
        g.append(this.getId());
        g.append(')');
        return g.toString();
    }
    
    public final void writeToOutoutStream(final OutputStream outputStream) {
        zzd.f((Object)outputStream, "openOutputStream");
        final byte[] uByteArray-TcUX1vc = this.toUByteArray-TcUX1vc();
        final byte[] copy = Arrays.copyOf(uByteArray-TcUX1vc, uByteArray-TcUX1vc.length);
        zzd.e((Object)copy, "java.util.Arrays.copyOf(this, size)");
        outputStream.write(copy);
    }
}
