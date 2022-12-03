PROGRAM=Tpgt
SRCDIR=src
CLASSDIR=classes
SOURCES= \
	$(SRCDIR)/view/AboutDialog.java \
	$(SRCDIR)/view/Advancedmenu.java \
	$(SRCDIR)/view/Beginnermenu.java \
	$(SRCDIR)/view/Charpanel.java \
	$(SRCDIR)/view/Cmdpanel.java \
	$(SRCDIR)/view/Helpmenu.java \
	$(SRCDIR)/view/HelpDialog.java \
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
	$(SRCDIR)/controller/AdvancedController.java \
	$(SRCDIR)/controller/Controller.java \
	$(SRCDIR)/controller/BeginnerController.java \
	$(SRCDIR)/controller/HelpController.java \
	$(SRCDIR)/controller/LessonController.java \
	$(SRCDIR)/controller/MiddleController.java \
	$(SRCDIR)/controller/OptionController.java \
	$(SRCDIR)/controller/TextpaneController.java \
	$(SRCDIR)/model/AppProperties.java \
	$(SRCDIR)/model/Model.java \
	$(SRCDIR)/Tpgt.java

CLASSES= \
	$(CLASSDIR)/controller/*.class \
	$(CLASSDIR)/model/*.class \
	$(CLASSDIR)/view/*.class \
	$(CLASSDIR)/*.class



Tpgt:
	javac -d classes -encoding UTF8 $(SOURCES)

run:
	java -cp classes $(PROGRAM)

jar:
	cd classes; jar cvfm ../tpgt.jar ../manifest.mf *
clean:
	rm $(CLASSES)
