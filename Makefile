PROGRAM=Tpgt
SRCDIR=src
SOURCES= \
	$(SRCDIR)/views/Beginnermenu.java \
	$(SRCDIR)/views/Charpanel.java \
	$(SRCDIR)/views/Cmdpanel.java \
	$(SRCDIR)/views/Lessonmenu.java \
	$(SRCDIR)/views/Mainwindow.java \
	$(SRCDIR)/views/Menubar.java \
	$(SRCDIR)/views/Progresspanel.java \
	$(SRCDIR)/views/Statuspanel.java \
	$(SRCDIR)/views/Textpanel.java \
	$(SRCDIR)/views/Worktable.java \
	$(SRCDIR)/Tpgt.java

CLASSES= \
	Beginnermenu.class \
	Charpanel.class \
	Cmdpanel.class \
	Lessonmenu.class \
	Mainwindow.class \
	Menubar.class \
	Progresspanel.class \
	Statuspanel.class \
	Textpanel.class \
	Tpgt.class \
	Worktable.class


Tpgt:
	javac -d classes $(SOURCES)

run:
	java -cp classes $(PROGRAM)

clean:
	rm classes/$(CLASSES)
