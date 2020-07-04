PROGRAM=Tpgt
SRCDIR=src
CLASSDIR=classes
SOURCES= \
	$(SRCDIR)/view/Beginnermenu.java \
	$(SRCDIR)/view/Charpanel.java \
	$(SRCDIR)/view/Cmdpanel.java \
	$(SRCDIR)/view/Helpmenu.java \
	$(SRCDIR)/view/Languagemenu.java \
	$(SRCDIR)/view/Lessonmenu.java \
	$(SRCDIR)/view/Mainwindow.java \
	$(SRCDIR)/view/Menubar.java \
	$(SRCDIR)/view/Middlemenu.java \
	$(SRCDIR)/view/Optionmenu.java \
	$(SRCDIR)/view/Progresspanel.java \
	$(SRCDIR)/view/Statuspanel.java \
	$(SRCDIR)/view/Textpanel.java \
	$(SRCDIR)/view/Worktable.java \
	$(SRCDIR)/controller/Controller.java \
	$(SRCDIR)/controller/BeginnerController.java \
	$(SRCDIR)/controller/HelpController.java \
	$(SRCDIR)/controller/MiddleController.java \
	$(SRCDIR)/controller/OptionController.java \
	$(SRCDIR)/model/AppProperties.java \
	$(SRCDIR)/Tpgt.java

CLASSES= \
	$(CLASSDIR)/AppProperties.class \
	$(CLASSDIR)/BeginnerController.class \
	$(CLASSDIR)/Beginnermenu.class \
	$(CLASSDIR)/Charpanel.class \
	$(CLASSDIR)/Cmdpanel.class \
	$(CLASSDIR)/Controller.class \
	$(CLASSDIR)/Helpmenu.class \
	$(CLASSDIR)/HelpController.class \
	$(CLASSDIR)/Language.class \
	$(CLASSDIR)/Lessonmenu.class \
	$(CLASSDIR)/Mainwindow.class \
	$(CLASSDIR)/Menubar.class \
	$(CLASSDIR)/MiddleController.class \
	$(CLASSDIR)/Middlemenu.class \
	$(CLASSDIR)/Optionmenu.class \
	$(CLASSDIR)/OptionController.class \
	$(CLASSDIR)/Progresspanel.class \
	$(CLASSDIR)/Statuspanel.class \
	$(CLASSDIR)/Textpanel.class \
	$(CLASSDIR)/Tpgt.class \
	$(CLASSDIR)/Worktable.class


Tpgt:
	javac -d classes $(SOURCES)

run:
	java -cp classes $(PROGRAM)

clean:
	rm $(CLASSES)
