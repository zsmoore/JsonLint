package com.zachary_moore.report;

import com.zachary_moore.lint.Error;
import j2html.tags.Tag;
import com.zachary_moore.objects.JSONFile;

import java.util.List;
import java.util.Map;

import static j2html.TagCreator.*;

class FileSection {

    Tag getFileSummary(Map.Entry<JSONFile, List<Error>> jsonFileToReports) {
        return div(
                h4(jsonFileToReports.getKey().getFilePath()).withClass("text-white"),
                div(
                  each(jsonFileToReports.getValue(), e -> p(e.getMessage()).withClass("text-white"))
               ).withClass("container-fluid")
        ).withClasses("container-fluid", "border", "bg-dark");
    }
}
