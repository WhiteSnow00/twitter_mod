// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.bookmarks.legacy.di.retained;

import com.twitter.app.common.timeline.di.view.TimelineViewGraph;
import kotlin.Metadata;
import com.twitter.app.bookmarks.folders.folder.di.BookmarkFolderTimelineRetainedGraph;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003\u00c0\u0006\u0003" }, d2 = { "Lcom/twitter/bookmarks/legacy/di/retained/LegacyBookmarkFolderTimelineRetainedGraph;", "Lcom/twitter/app/bookmarks/folders/folder/di/BookmarkFolderTimelineRetainedGraph;", "LegacyBookmarkFolderTimelineViewGraph", "feature.tfa.bookmarks.legacy_release" }, k = 1, mv = { 1, 7, 1 })
@l4j
public interface LegacyBookmarkFolderTimelineRetainedGraph extends BookmarkFolderTimelineRetainedGraph
{
    @Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002\u00c0\u0006\u0003" }, d2 = { "Lcom/twitter/bookmarks/legacy/di/retained/LegacyBookmarkFolderTimelineRetainedGraph$LegacyBookmarkFolderTimelineViewGraph;", "Lcom/twitter/app/common/timeline/di/view/TimelineViewGraph;", "feature.tfa.bookmarks.legacy_release" }, k = 1, mv = { 1, 7, 1 })
    @l4j
    public interface LegacyBookmarkFolderTimelineViewGraph extends TimelineViewGraph
    {
    }
}
